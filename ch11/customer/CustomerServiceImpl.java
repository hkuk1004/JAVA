package customer;

import java.util.Collection;

// Ex01�� ���� ���޹��� ��ɾ �м��ؼ� ó���� ������ Dao���� ��Ű�� ����� EX01����
public class CustomerServiceImpl {
	private static CustomerDaoImpl cd = new CustomerDaoImpl();
	public int insert(Customer customer) {
		int result = 0;  // 0�� ����, 1�� ����
		// map���� �Է��� id�� �����͸� �о ������ �̹� �ִ� ���̵� �Դϴ�
		// ������ �����͸� map�� ����
		Customer ct = cd.select(customer.getId());
		if (ct == null) result = cd.insert(customer);
		else System.out.println("�̹� �ִ� ���̵�� �ٸ� ���� ����ϼ���");
		return result;
	}
	public Customer select(String id) { // string���ٴ� id���� ���� �������� ����
		return cd.select(id);
	}
	public Collection<Customer> list() {
		return cd.list();
	}	
}