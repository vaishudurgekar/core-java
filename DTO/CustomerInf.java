interface CustomerInf{

 boolean createOrder(OrderDTO dto);
 void getOrderDetails();
 void getOrderNameById(int id);
 boolean updateOrderQuantityById();
 boolean deleteOrderById(String id);
 
}