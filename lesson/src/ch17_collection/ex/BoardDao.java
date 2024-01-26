package ch17_collection.ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> boardList = new ArrayList<>();

	public BoardDao() {
		boardList.add(new Board("자바 세계에 오신걸 환영합니다.", "제임스"));
		boardList.add(new Board("안녕하세요? 반갑습니다.", "마리아"));
		boardList.add(new Board("좋은 하루 되세요.", "브라이언"));
		boardList.add(new Board("휴먼교육센터에서 강의를 들어보세요.", "엠마"));
		boardList.add(new Board("스프링부트도 함께 배워요.", "제임스"));
	}

	public List<Board> getBoardList() {
		List<Board> resultList = new ArrayList<>();
		for (Board board : boardList) {
			resultList.add(new Board(board.getTitle(), board.getContent()));
		}
		return resultList;
	}
}
