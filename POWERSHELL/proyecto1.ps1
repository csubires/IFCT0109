
New-Item -Path C:\Informes\Procesos -ItemType Directory
New-Item -Path C:\Informes\Servicios -ItemType Directory
$process=Get-Process | Where-Object {$_.WorkingSet / 1MB -gt 150} | Select-Object Name,Id,CPU | Export-Csv -Path resumen_procesos.csv -NoTypeInformation
$service=Get-Service | Where-Object {$_.Status -eq 'Stopped'} | Select-Object Name,DisplayName,Status | Out-String | Out-File -FilePath C:\Informes\Servicios\servicios.txt
