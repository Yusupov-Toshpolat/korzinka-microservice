package uz.nt.orderservice.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import shared.libs.dto.ProductDto;
import shared.libs.dto.ProductServiceExchangeDto;
import shared.libs.dto.ResponseDto;
import uz.nt.orderservice.config.FeignConfiguration;
import shared.libs.dto.OrderedProductsDetail;

import java.util.List;
import java.util.Map;

@FeignClient(name = "product-service", configuration = FeignConfiguration.class)
@LoadBalancerClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/product-api/product/check")
    ProductServiceExchangeDto check();

    @PostMapping("/product/update-amount")
    ResponseDto<Boolean> subtractAmount(@RequestParam(value = "productId") Integer productId, @RequestParam(value = "amount") Double amount);

    @GetMapping("product/check-amount")
    ResponseDto<Boolean> checkAmountProduct(@RequestParam(value = "productId") Integer productId, @RequestParam(value = "amount") Double amount);
    @PostMapping("product/set-amount")
    ResponseDto setProductAmount(@RequestParam(value = "amount") Double amount, @RequestParam(value = "productId") Integer productId);

    @PostMapping("product/products-by-id")
    ResponseDto<Map<Integer, ProductDto>> getProductDtoList(@RequestBody List<Integer> productIdList);


    @PostMapping("/rollback-product-amount")
    void rollback(@RequestBody List<OrderedProductsDetail> orderedProducts);
}
