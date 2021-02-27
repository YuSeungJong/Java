package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		List<Object> arr = new ArrayList<>();
		
		System.out.print("조회번호>");
		String input = ScanUtil.nextLine();
		System.out.print("조회번호>");
		String input1 = ScanUtil.nextLine();
		System.out.print("조회번호>");
		int input2 = ScanUtil.nextInt();
		
		
		String sql = "update tb_jdbc_board "
					+ "set title = ? "
					+ ", content = ? "
					+ "where board_no = ?" ;
		arr.add(input);
		arr.add(input1);
		arr.add(input2);
		
		List<Map<String, Object>> list = jdbc.selectList(sql, arr);
		System.out.println(list);
		
	}

}
