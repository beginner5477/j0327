package t8_insa;

import java.sql.SQLException;
import java.util.Vector;

public class Insa2DAO extends DBconn{
	Insa2VO vo = null;

	//회원 개별조회(성명중복체크도 가능)
	public Insa2VO getNameSearch(String name) {
		Insa2VO vo = new Insa2VO();
		try {
			sql = "select * from insa2 where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setIpsail(rs.getString("ipsail"));
			}
		} catch (SQLException e) {
			System.out.println("SQL오류: "+e.getMessage());
		} finally {
			rsClose();
		}
		
		return vo;
	}

	//회원 가입 처리
	public int setInsaInput(Insa2VO vo) {
		int res = 0;
		
		try {
			sql = "insert into insa2 values (default,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getIpsail());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL오류: "+e.getMessage());
		} finally {
			pstmtClose();
		}
		
		return res;
	}

	public int setInsaUpdate(Insa2VO vo) {
		int res = 0;
		try {
			sql = "update insa2 set age = ?, gender = ?,ipsail = ? where name =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getAge());
			pstmt.setString(2, vo.getGender());
			pstmt.setString(3, vo.getIpsail());
			pstmt.setString(4, vo.getName());
			res = pstmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			pstmtClose();
		}
		return res;
	}

	//자료 삭제처리
	public int setInsaDelete(String name) {
		int res = 0;
		try {
			sql = "delete from insa2 where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			res = pstmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			pstmtClose();
		}
		return res;
	}

	public Vector getInsaList(String str, String order) {
		Vector vData = new Vector<>();
		try {
			if(str.equals("ipsail")&&order.equals("a"))
			{
				sql = "select * from insa2 order by ipsail asc";
			}
			else if(str.equals("ipsail")&&order.equals("b"))
			{
				sql = "select * from insa2 order by ipsail desc";
			}
			else sql = "select * from insa2 order by idx desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Vector vo = new Vector<>();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("name"));
				vo.add(rs.getInt("age"));
				vo.add(rs.getString("gender"));
				vo.add(rs.getString("ipsail").substring(0,10));
				vData.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			rsClose();
		}
		return vData;
	}

	//조건 이용한 검색
	public Vector getConditionSearch(String string, String txtCondi) {
		Vector vData = new Vector<>();
		
		try {
			sql = "select * from insa2 where "+string+" like ? order by name asc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+txtCondi+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Vector vo = new Vector<>();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("name"));
				vo.add(rs.getInt("age"));
				vo.add(rs.getString("gender"));
				vo.add(rs.getString("ipsail").substring(0,10));
				vData.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			rsClose();
		}
		
		
		return vData;
	}
	
}
