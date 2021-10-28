package a.b.c.com.board.service;

import java.util.List;

import a.b.c.com.board.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> boardSelect(BoardVO bvo);
	public List<BoardVO> boardSelectAll(BoardVO bvo);
	public int boardInsert(BoardVO bvo);
	public int boardUpdate(BoardVO bvo);
	public int boardDelete(BoardVO bvo);
	
	// ��й�ȣ üũ 
	public List<BoardVO> boardIdCheck(BoardVO bvo);
}
