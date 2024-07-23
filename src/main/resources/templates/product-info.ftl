<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h4>Подробная инфорация о товаре</h4>
<b>Название товара: </b>${product.title}</br>
<b>Описание товара: </b>${product.description}</br>
<b>Цена: </b>${product.price}</br>
<b>Город: </b>${product.city}</br>
<b>Автор: </b>${product.author}</br>
<hr>

<form action="/product/delete/${product.id}" method="post">
    Название объявления: <input type="text" name="title"/><br><br>
    Описание объявления: <input type="text" name="description"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Город: <input type="text" name="city"/><br><br>
    Имя: <input type="text" name="author"/><br><br>
    <input type="submit" value="Удалить товар"/>
</form>
</body>
</html>
