<?php
/**
 * @author Iván Morray Nguema
*/

// VAriables de la conexion a la base de datos

$host = "127.0.0.1";
$username = "root";
$password = "dbrootpass" ;
$database = "examen_ev2";

try{
    // Creamos una instancia de PDO
    $conn = new PDO("mysql:host=host;dbname=$database", $username, $password );

    //Configurar PDO para que lance excepciones en caso de errores
    $conn->setAtribute(PDO::ATT_ERRMODE, PDO::ERRMODE_EXCEPTION);

    echo "Connection succesful to data base";

}catch(PDOExcepton $e){
    die("Error al conectar a la base de datos: ");
}

// Deberé realizar $conn para ralizar las consultas





?>