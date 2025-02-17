package board.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.bean.BoardDTO;

public class BoardDAO {
	private SqlSessionFactory sqlSessionFactory;
	
	private static BoardDAO boardDAO = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return boardDAO;
	}
	
	public BoardDAO() {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void boardWrite(Map<String, String> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("boardSQL.boardWrite", map);
		
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	public List<BoardDTO> boardList(int startNum, int endNum){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum-1);
		map.put("endNum", 5);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BoardDTO> list = sqlSession.selectList("boardSQL.boardList", map);
		sqlSession.close();
		return list;
	}
	
	public int getTotalA(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int totalA = sqlSession.selectOne("boardSQL.getTotalA");
		sqlSession.close();
		return totalA;
	}

	public BoardDTO getBoard(int seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardDTO boardDTO = sqlSession.selectOne("boardSQL.getBoard", seq);
		sqlSession.close();
		return boardDTO;
	}

	public void boardReply(Map<String, String> map) {
		
		//원글
		BoardDTO boardDTO = this.getBoard(Integer.parseInt(map.get("pseq")));
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//step(글순서) update
		//update board set step=step+1 where ref=#{원글ref} and step > #{원글step}
		sqlSession.update("boardSQL.boardReplyStep", boardDTO);
		
		//insert
		//Map안에는 id, name, email, subject, content를 가지고왔다. ref, lev, step을 추가
		map.put("ref", boardDTO.getRef()+"");//답글ref = 원글ref
		map.put("lev", boardDTO.getLev()+1+"");//답글lev = 원글lev+1
		map.put("step", boardDTO.getStep()+1+"");//답글step = 원글step+1
		sqlSession.insert("boardSQL.boardReply", map);
		//reply(답글수) update
		//update board set reply=reply+1 where seq=#{pseq}
		sqlSession.update("boardSQL.boardReplyReply", Integer.parseInt(map.get("pseq")));
		
		sqlSession.commit();
		sqlSession.close();
		
	}


	public void boardUpdate(Map<String, Object> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("boardSQL.boardUpdate", map);
		sqlSession.commit();
		sqlSession.close();
		
	}
	
	public void boardDelete(int seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("boardSQL.boardDelete", seq);
		sqlSession.commit();
		sqlSession.close();
	}
	
}











