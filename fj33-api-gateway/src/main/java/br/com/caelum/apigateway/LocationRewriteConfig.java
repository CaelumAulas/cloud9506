package br.com.caelum.apigateway;


import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.post.LocationRewriteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class LocationRewriteConfig {


    @Bean
    LocationRewriteFilter locationRewriteFilter() {
        return new LocationRewriteFilter() {
            @Override
            public boolean shouldFilter() {
                RequestContext ctx = RequestContext.getCurrentContext();
                int statusCode = ctx.getResponseStatusCode();
                return HttpStatus.valueOf(statusCode).is3xxRedirection() ||
                        HttpStatus.valueOf(statusCode).is2xxSuccessful();
            }
        };
    }
}
