package top.hellocode.dao;

import org.aspectj.weaver.ast.Or;
import top.hellocode.pojo.OrderSetting;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author HelloCode
 * @site https://www.hellocode.top
 * @date 2022年08月23日 16:35
 */
public interface OrderSettingDao {
    public void add(OrderSetting orderSetting);
    public void editNumberByOrderDate(OrderSetting orderSetting);
    public long findCountByOrderDate(Date orderDate);
    public List<OrderSetting> getOrderSettingByMonth(Map map);
    public OrderSetting findByOrderDate(Date orderDate);
    public void editReservationsByOrderDate(OrderSetting orderSetting);
}
