<h1 align="center">Conversor de Monedas</h1>

<p><em>Descripción</em></p>
<p>Este proyecto es una aplicación de consola en Java que permite convertir entre varias monedas. Presenta un menú interactivo donde los usuarios pueden elegir la conversión que desean realizar, ingresar un monto y obtener el resultado de la conversión utilizando tasas de cambio actuales obtenidas de una API.</p>

<p><em>Características</em></p>
<ul>
    <li>Menú interactivo con múltiples opciones de conversión.</li>
    <li>Mensajes de bienvenida e instrucciones claras.</li>
    <li>Soporte para conversión entre las siguientes monedas:</li>
    <ul>
        <li>Dólares (USD) a Euros (EUR)</li>
        <li>Euros (EUR) a Dólares (USD)</li>
        <li>Dólares (USD) a Pesos Mexicanos (MXN)</li>
        <li>Pesos Mexicanos (MXN) a Dólares (USD)</li>
        <li>Dólares (USD) a Reales Brasileños (BRL)</li>
        <li>Reales Brasileños (BRL) a Dólares (USD)</li>
        <li>Dólares (USD) a Pesos Argentinos (ARS)</li>
        <li>Pesos Argentinos (ARS) a Dólares (USD)</li>
    </ul>
    <li>Permite realizar múltiples conversiones sin necesidad de reiniciar la aplicación.</li>
    <li>Utiliza la API de Exchange Rate para obtener tasas de cambio actualizadas.</li>
</ul>

<p><em>Requisitos</em></p>
<ul>
    <li>Java 11 o superior</li>
    <li>IDE que sea compatible con Java</li>
    <li>Debe estar conectado a internet para el uso de la API</li>
</ul>

<p><em>Instalación</em></p>
<ol>
    <li>Abre el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA).</li>
    <li>Asegúrate de tener Java 11 o superior instalado.</li>
</ol>

<p><em>Configuración</em></p>
<ol>
    <li>Crea un archivo <code>config.properties</code> en la raíz del proyecto.</li>
    <li>Añade tu API Key para el servicio de Exchange Rate en el archivo <code>config.properties</code>:</li>
</ol>
<pre><code>apiKey=tu_api_key_aqui</code></pre>

<p><em>Uso</em></p>
<ol>
    <li>Compila y ejecuta la clase Principal, la cual despliega el menú de opciones.</li>
    <li>Al iniciar, verás un menú interactivo. Elige una opción de conversión de preferencia y sigue los pasos para introducir el monto.</li>
</ol>

<p><em>API Utilizada</em></p>
<p>Utilizamos la Exchange Rate API para obtener las tasas de cambio actualizadas. Asegúrate de registrar tu propia API Key y agregarla al archivo <code>config.properties</code>.</p>

<p><em>Desarrollado por</em></p>
<p>Stanley Faria</p>
