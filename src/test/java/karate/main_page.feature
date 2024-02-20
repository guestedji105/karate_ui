Feature: Main page

  Background:
    # Выполняем логин
    * call read('login.feature')
    # Добавляем локаторы страницы в переменную доступную из теста
    * def mp = Java.type('org.example.locators.MainPageLocators').MainPageLocatorsMap
    # Делаем браузер на полный экран
    * driver.maximize()
    # Вот так можем согласится/отказаться в pop-up окне, если нужно
    # * dialog(true/false)

  @addToCart
  Scenario: Add product to cart
    When click(mp.addToCartButton)
    Then match text(mp.shoppingCartItemsCount) == "1"

  Scenario: Remove product from cart
    * call read('main_page.feature@addToCart')
    When click(mp.removeFromCartButton)
    Then match text(mp.shoppingCartItemsCount) == ""
    # screenshot(Optional locator, Optional isEmbedToReport)
    # Если локатора нет, то скриншот всей страницы
    # isEmbedToReport по умолчанию true
    # В данном случае добавление скриншота элемента по локатору в отчёт
    And screenshot(mp.shoppingCartItemsCount)

  Scenario: Navigate to product page list
    * def list = locateAll(mp.productsLinkList)
    When list[4].click()
    Then match driver.text(mp.productName) contains "Onesie"
    # В данном случае добавление скриншота скриншота страницы в байт array
    * def bytes = screenshot(false)
    # А затем в файл
    * def file = karate.write(bytes, 'test.png')
    * print 'screenshot saved to: ', file

  Scenario Outline: Navigate to product page outline
    When click(<link>)
    # Подсвечиваем элемент в целях дебага
    # And highlight(mp.productName)
    # В данном случае добавление скриншота всей страницы в отчёт
    Then screenshot()
    And match driver.url contains <uri>
    And screenshot(mp.shoppingCartItemsCount)

    Examples:
      | link                | uri                        |
      | mp.backpackPageLink | 'inventory-item.html?id=4' |
      | mp.bikeLightLink    | 'inventory-item.html?id=0' |