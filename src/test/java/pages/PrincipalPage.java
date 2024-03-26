package pages;



public class PrincipalPage extends BasePage {

    private String url = "https://www.liverpool.com.mx/tienda/home";
    private String searchBar = "//input[contains(@id,'mainSearchbar')]";
    private String playstation5 = "//h5[@class='card-title a-card-description'][contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'playstation 5')]";
    private String consola = "//h5[@class='card-title a-card-description'][contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'consola')]";
    private String descriptionTest = "//h1[@class='a-product__information--title']";
	  private String cantidadTest = "//p[contains(@class,'a-product__paragraphDiscountPrice m-0 d-inline ')]";
    private String labelSize = "//label[contains(@title,'Tama\\u00F1o')]";
	  private String labelPrice = "//label[contains(@title,'Precios')]";
    private String SeeMoreLink = "//a[contains(@id,'Tamao')]";
    private String check55 = "//input[contains(@id,'variants.normalizedSize-55 pulgadas')]";
    private String radio10 = "//input[contains(@id,'variants.prices.sortPrice-10000-700000')]";
    private String brandRadioSony = "//input[@id='brand-SONY']";
    private String information = "//li[@class='m-product__card card-masonry a']";
    private String categoryLink = "//span[contains(@class,'a-header__strongLink nav-desktop-menu-action pr-3 pb-3')]";
    private String bellezaLink = "//span[@class='t-titleCategory'][contains(.,'Belleza')]";
    private String PerfumeMan = "//a[contains(.,'Perfumes Hombre')]";
    private String DiorCheck = "//input[contains(@id,'brand-DIOR')]";
    private String seeMoreBrand = "//a[contains(@id,'Marcas')]";

    public PrincipalPage(){
        super(driver);
    }
     public void navigateToLiverpool(){
        navigateTo(url);
    }

    public void clickInsertEnterPagePrincipal(String value){
      write(searchBar,value);
    }

    public int findPlayandConsolaPrincipalPage(){
      return findPlayandConsolaBasePage(playstation5,consola);
    }

    public void findProductoPlayStation5PrincipalPage(){
      clickElement(playstation5);
    }

    public String validateTitlePrincipalPage(String value){
      if(value.equals("title")){
        return validateTitlePriceBasePage(descriptionTest);
      }else{
        return validateTitlePriceBasePage(cantidadTest);
      }
      
    }

    public String validatePricePrincipalPage(){
      return validateTitlePriceBasePage(cantidadTest);
    }

    public String validateSizePricePrincipalPage(){
        return validateSizePriceBasePage(labelPrice);
    }

    public void clickSeeMorePrincipalPage(){
        clickElement(SeeMoreLink);
    }

    public void clickOnCategoriasPrincipalPage(){
        clickElement(categoryLink);
    }

    public void click55inchesPrincipalPage(){
      clickElement(check55);
    }

    public void clickOnPricePrincipalPage(){
      clickElement(radio10);
    }

    public void clickOnBrandPrincipalPage(){
      clickElement(brandRadioSony);
    }

    public int ValidateResultCountPrincipalPage(){
        return validateResultCountBasePage(information);
    }

    public void clickOnBellezaPrincipalPage(){
        findValidMove(bellezaLink);
    }

    public void clickOnPerfumeHombrePrincipalPage(){
      clickElement(PerfumeMan);
    }

    public void selectDiorFilterPagePrincipal(){
      clickElement(seeMoreBrand);
      clickElement(DiorCheck);
    }
}
