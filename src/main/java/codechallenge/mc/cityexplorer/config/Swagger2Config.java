package codechallenge.mc.cityexplorer.config;

// TODO https://github.com/springfox/springfox/issues/2932
// TODO Swagger WILL NOT work just by adding dependencies, its a known issue
// TODO With more time some workaround can be found.
// TODO But for this project skipping them.
// TODO So commenting out @Configuration and @EnableSwagger2 annotations.
// TODO Also commented out the swagger related dependencies in pom.xml

// @Configuration
// @EnableSwagger2
public class Swagger2Config {

/*   // @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("codechallenge.mc.cityexplorer.controllers"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Code challenge for MC")
                .description("City Explorer REST API")
                .contact(new Contact("Code Challenge Project", "codechallenge.mc", "abc@xyz.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }*/

}
