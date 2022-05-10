//package com.fueladvisor.fuelappapigateway.security.filters;
//
//import com.fueladvisor.fuelappapigateway.security.service.JwtService;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class JwtOnRequestTokenFilter extends AbstractGatewayFilterFactory<JwtOnRequestTokenFilter.Config> {
//    private final JwtService jwtService;
//
//    public JwtOnRequestTokenFilter(JwtService jwtService) {
//        super(Config.class);
//        this.jwtService = jwtService;
//    }
//
//    public static class Config {
//    }
//
//    @Override
//    public GatewayFilter apply(Config config) {
//        return (exchange, chain) -> {
//            ServerHttpRequest request = exchange.getRequest();
//
//            if (!request.getHeaders().containsKey("Authorization")) {
//                return onError(exchange, HttpStatus.UNAUTHORIZED);
//            }
//
//            String token = request.getHeaders().getFirst("Authorization");
//
//            if (!jwtService.isTokenValid(token)) {
//                return onError(exchange, HttpStatus.UNAUTHORIZED);
//            }
//
//            return chain.filter(exchange);
//        };
//    }
//
//    private Mono<Void> onError(ServerWebExchange exchange, HttpStatus status) {
//        ServerHttpResponse response = exchange.getResponse();
//        response.setStatusCode(status);
//
//        return response.setComplete();
//    }
//}
