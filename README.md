<h1 >Демопроект автоматизации UI на сайте <a href="https://store.steampowered.com/ ">steam</a></h1>

![Steam_logo.svg.png](images/logo/Steam_logo.svg.png)

## :bookmark_tabs: Содержание 

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Allure отчеты</a>

* <a href="#telegram">Уведомления в Telegram с использованием бота</a>

* <a href="#video">Пример прогона теста в Selenoid</a>

<a id="tools"></a>
## Технологии и инструменты

| Java                                                                                                      | IntelliJ Idea                                                                                                                 | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure                                                                                                                             |  Jenkins                                                                                                           |
|:----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> |   <a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> |

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки

- :small_blue_diamond: Параметризованный тест смены языка на русский, финский, немецкий 
- :small_blue_diamond: Переход на главную страницу магазина Steam по нажатию на лого
- :small_blue_diamond: Открытие страницы 'Обсуждений' из выпадающего меню вкладки Сообщества 
- :small_blue_diamond: Проверка отображения секций на верхней и боковой разделах страницы магазина
- :small_blue_diamond: Добавление игры в корзину

<a id="console"></a>
## :computer: Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test 
```

### Удаленный запуск тестов

```
gradle clean test 
"-Dbrowser=${BROWSER}" 
"-DbrowserVersion=${BROWSER_VERSION}" 
"-DbrowserSize=${BROWSER_SIZE}" 
"-DremoteUrl=${REMOTE_URL}"
```

> `${BROWSER}` - наименование браузера (_по умолчанию - <code>chrome</code>_).
>
> `${BROWSER_VERSION}` - версия браузера (_по умолчанию - <code>100.0</code>_).
>
> `${BROWSER_SIZE}` - размер окна браузера (_по умолчанию - <code>1920x1080</code>_).
>
> `${REMOTE_URL}` - адрес удаленного сервера, на котором будут запускаться тесты.

<a id="jenkins"></a>
## <img src="images/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в Jenkins

<a target="_blank" href="https://jenkins.autotests.cloud/job/AD_steam_project_test/">Сборка в Jenkins</a>
<p align="center">

> Сборка с параметрами позволяет перед запуском изменить параметры для сборки (путем выбора из списка или прямым указанием значения).

<a href="https://jenkins.autotests.cloud/job/AD_steam_project_test/"><img src="images/screenshots/jenkinsJob.png" alt="Jenkins"/></a>
</p>

<a id="allure"></a>
## <img src="images/logo/Allure.svg" width="25" height="25"/></a> Allure отчеты

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allureRepMain.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/screenshots/allureRepTests.png">
</p>

<a id="telegram"></a>
## <img src="images/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram с использованием бота

<p >
<img title="telegram bot" src="images/screenshots/telegramBot.png">
</p>

<a id="video"></a>
## <img src="images/logo/Selenoid.svg" width="25" height="25"/></a> Пример прогона теста в Selenoid

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/video/addToCartVideo.gif">
</p>