{
"capabilities":
[
{
"browserName": "",
"version": "4.4.2",
"maxInstances": 2,
"platform": "ANDROID",
"deviceName": "32082496ef565165"
}
],
"configuration":
{
"nodeTimeout":120, 
"port":4728, 
"hubPort":4444,
"proxy": "org.openqa.grid.selenium.proxy.DefaultRemoteProxy",
"url":"http://127.0.0.1:4728/wd/hub",
"hub": "127.0.0.1:4444/grid/register",
"hubHost":"127.0.0.1",
"nodePolling":2000, 
"registerCycle":10000,
"register":true,
"cleanUpCycle":2000, 
"timeout":30000, 
"maxSession":2
}
}