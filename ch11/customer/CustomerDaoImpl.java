package customer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// ���޹��� ����� ����(map(DB)�� ����, ����, ����, �а�
public class CustomerDaoImpl {  // DAO Data Access Object
	private Map<String, Customer> map = new HashMap<>(); // key�� id, �� ������
	public Customer select(String id) {
		return map.get(id);  // get(Key)
	}
	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}
	public Collection<Customer> list() {
		return map.values();
	}
}