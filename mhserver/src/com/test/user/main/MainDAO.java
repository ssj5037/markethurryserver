package com.test.user.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.ArrayList;

import com.test.user.event.EventDTO_lh;
import com.test.user.product.ProductlistDTO;

public class MainDAO {

	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	private ResultSet rs;

	public MainDAO() {

		DBUtil util = new DBUtil();
		conn = util.open();

	}
	
	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int loginCheck(MemberDTO dto) {
		
		try {
			String sql = "select pw from member where id=? and delflag=0";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			
			rs = pstat.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(dto.getPw())) {
					return 1;
				} else {
					return 0;
				}
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public MemberDTO setinfo(MemberDTO dto) {
		try {
			String sql = "select * from member where id=?";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, dto.getId());
			
			rs = pstat.executeQuery();
			if(rs.next()) {
				dto.setSeq(rs.getString("seq"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setTel(rs.getString("tel"));
				dto.setGradeseq("gradeseq");
				dto.setAddress(rs.getString("address"));
				dto.setBirth(rs.getString("birth"));
				dto.setGender(rs.getString("gender"));
				
			}
			return dto;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int idcheck(String id) {
		
		try {
			String sql = "select count(*) as cnt from member where id=? and delflag=0";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, id);
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 1;
	}

	public int emailCheck(String email) {
		
		try {
			String sql = "select count(*) as cnt from member where email=? and delflag=0";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, email);
			rs = pstat.executeQuery();
			
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 1;
	}

	public ArrayList<ProductlistDTO> gettodyHotProduct() {
		
		try {
			String sql = "select p.seq as productseq, p.name as name, p.price as price, p.img as img, p.shortdesc as shortdesc from(select rownum, a.* from (select * from orderdetail od inner join orderlist ol on od.orderseq = ol.seq where regdate = '200722' and ol.delflag = 0 order by qty desc)a where rownum <= 8) a inner join product p on a.productseq = p.seq";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			ArrayList<ProductlistDTO> list = new ArrayList<ProductlistDTO>();
			
			while(rs.next()) {
				
				ProductlistDTO dto = new ProductlistDTO();
				dto.setSeq(rs.getString("productseq"));
				dto.setName(rs.getString("name"));
				dto.setPrice(NumberFormat.getInstance().format(rs.getInt("price")));
				dto.setImg(rs.getString("img"));
				dto.setShortdesc(rs.getString("shortdesc"));
				list.add(dto);
			}
			
			stat.close();
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public ArrayList<ProductlistDTO> getHotProduct() {
		
		try {
			String sql = "select a.*, rownum as rnum from (select distinct p.seq as seq, p.name as name, p.img as img, p.price as price, p.shortdesc as shortdesc, (select count(*) from orderdetail where productseq = od.productseq) as cnt from product p, orderdetail od where p.seq = od.productseq order by cnt desc)a where rownum <= 8";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			ArrayList<ProductlistDTO> list = new ArrayList<ProductlistDTO>();
			
			while(rs.next()) {
				ProductlistDTO dto = new ProductlistDTO();
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setPrice(NumberFormat.getInstance().format(rs.getInt("price")));
				dto.setImg(rs.getString("img"));
				dto.setShortdesc(rs.getString("shortdesc"));
				
				list.add(dto);
			}
			stat.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public ArrayList<ProductlistDTO> getSalesProduct() {

		try {
			String sql = "select a.*, rownum as rnum from (select distinct p.seq as seq, p.name as name, p.img as img, p.price as price, p.shortdesc as shortdesc, (select count(*) from orderdetail where productseq = od.productseq) as cnt from product p, orderdetail od where p.seq = od.productseq order by cnt asc)a where rownum <= 8";
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			ArrayList<ProductlistDTO> list = new ArrayList<ProductlistDTO>();
			while(rs.next()) {
				ProductlistDTO dto = new ProductlistDTO();
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setPrice(NumberFormat.getInstance().format(rs.getInt("price")));
				dto.setImg(rs.getString("img"));
				dto.setShortdesc(rs.getString("shortdesc"));
				
				list.add(dto);
			}
			stat.close();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<EventDTO_lh> getEventList() {
		
		try {
			String sql = "select * from event where seq in (106,107,108) and delflag = 0";
			stat = conn.createStatement();
			
			rs = stat.executeQuery(sql);
			ArrayList<EventDTO_lh> list = new ArrayList<EventDTO_lh>();
			while(rs.next()) {
				EventDTO_lh dto = new EventDTO_lh();
				dto.setSeq(rs.getString("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setImg(rs.getString("image"));
				dto.setStartdate(rs.getString("startdate"));
				dto.setEnddate(rs.getString("enddate"));
				
				list.add(dto);
			}
			rs.close();
			stat.close();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public ArrayList<ProductlistDTO> getRecommendProduct() {
		
		try {
			String sql = "select * from(select * from product where category = 0 and delflag = 0 order by regdate desc) a where rownum <=8";
			stat = conn.createStatement();
			
			rs=stat.executeQuery(sql);
			
			ArrayList<ProductlistDTO> list = new ArrayList<ProductlistDTO>();
			while(rs.next()) {
				ProductlistDTO dto = new ProductlistDTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setImg(rs.getString("img"));
				dto.setPrice(NumberFormat.getInstance().format(rs.getInt("price")));
				dto.setShortdesc(rs.getString("shortdesc"));
				
				list.add(dto);
			}
			
			stat.close();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
