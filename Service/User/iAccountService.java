package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.Users;

@Service
public interface iAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
	public Users CheckEmailAccount(Users user);
}
