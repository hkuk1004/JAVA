package customer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// 전달받은 명령을 실행(map(DB)에 저장, 수정, 삭제, 읽고
public class CustomerDaoImpl {  // DAO Data Access Object
	private Map<String, Customer> map = new HashMap<>(); // key는 id, 값 고객정보
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