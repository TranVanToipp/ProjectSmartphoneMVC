package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.MapperProductOrderManage;
import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;

@Repository
public class ProductsOrdersManageDao extends BaseDao{

	public List<ProductsOrdersManageDto> getDataOrdersManageDtos(){
		List<ProductsOrdersManageDto> list = new ArrayList<ProductsOrdersManageDto>();
		String sql = "SELECT o.id, o.maHD,p.title,o.user_name, o.gender, o.phone_number, o.note, tp.nameTP, qh.nameQH, xp.nameXa, o.num, o.money, o.created_at, s.name_status \r\n"
				+ "FROM orders o LEFT JOIN devvn_tinhthanhpho tp ON  o.tinh_tp = tp.matp LEFT JOIN devvn_quanhuyen qh ON  o.quan_huyen = qh.maqh \r\n"
				+ "LEFT JOIN devvn_xaphuongthitran xp ON  o.xa_phuong = xp.xaid  LEFT JOIN product p ON o.product = p.id \r\n"
				+ "LEFT JOIN status_orders s ON o.status = s.id ORDER BY o.created_at DESC ";
		list = _jdbcTemplate.query(sql, new MapperProductOrderManage());
		return list;
	}
	public List<ProductsOrdersManageDto> getDataOrdersManageDtos(String status){
		List<ProductsOrdersManageDto> list = new ArrayList<ProductsOrdersManageDto>();
		String sql = "SELECT o.id, o.maHD,p.title,o.user_name, o.gender, o.phone_number, o.note, tp.nameTP, qh.nameQH, xp.nameXa, o.num, o.money, o.created_at, s.name_status \r\n"
				+ "	FROM orders o LEFT JOIN devvn_tinhthanhpho tp ON  o.tinh_tp = tp.matp LEFT JOIN devvn_quanhuyen qh ON  o.quan_huyen = qh.maqh \r\n"
				+ "	LEFT JOIN devvn_xaphuongthitran xp ON  o.xa_phuong = xp.xaid  LEFT JOIN product p ON o.product = p.id \r\n"
				+ "	LEFT JOIN status_orders s ON o.status = s.id WHERE o.status = '"+status+"' ORDER BY o.created_at DESC ";
		list = _jdbcTemplate.query(sql, new MapperProductOrderManage());
		return list;
	}
	public int UpdateOrder(String status,String id) {
		String sql= "UPDATE orders SET status='"+status+"' WHERE id="+id;
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
