package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginateDto;

@Service
public interface iPaginateService {
	public PaginateDto GetDataInfoPaginate(int totalData, int totalProductsPage, int currentPage);
}
