package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.AccountDao;
import DiamonShop.Entity.Users;

@Service
public class AccountServiceImp implements iAccountService {
	@Autowired
	public AccountDao accountDao;

	@Override
	public int AddAccount(Users user) {

		user.setPassWord(BCrypt.hashpw(user.getPassWord(), BCrypt.gensalt(12)));
		return accountDao.addAccount(user);

	}

	@Override
	public Users CheckAccount(Users user) {
		String pass = user.getPassWord();
		user = accountDao.GetDataAccountUserByEmail(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassWord())) {
				return user;
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public Users CheckEmailAccount(Users user) {
		user = accountDao.GetDataAccountUserByEmail(user);
		if (user != null) {

			return user;
		}
		return null;
	}

}
