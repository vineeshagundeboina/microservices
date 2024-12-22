package in.ashokit.Api_Gateway.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		System.out.println("filter() ---executed.....");
		
		// TODO Validate the request
		
		org.springframework.http.server.reactive.ServerHttpRequest request=exchange.getRequest();
		
		HttpHeaders header=request.getHeaders();
		
		Set<String> keySet=header.keySet();
		if(!keySet.contains("Secret")) {
			throw new RuntimeException("invalid request");
		}
		
		List<String> list=header.get("Secret");
		if(!list.get(0).equals("ashokit@123")) {
			throw new RuntimeException("invalid request");
		}

		return chain.filter(exchange);
	}

}
