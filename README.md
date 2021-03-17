# spring-boot-cookbook
Spring Boot Cookbook - Tutorial from SFG in courses `Spring Framework 5` and `Docker for Java Developers`

####  514/98. Spring Boot DB2 Express Example

-  [IBM Db2 Docker Image](https://hub.docker.com/r/ibmcom/db2)
-  [Installing the Db2 Community Edition Docker image on Windows systems](https://www.ibm.com/support/producthub/db2/docs/content/SSEPGG_11.5.0/com.ibm.db2.luw.db2u_openshift.doc/doc/t_install_db2CE_win_img.html)
-  I had an error
    -  `com.ibm.db2.jcc.am.SqlSyntaxErrorException: DB2 SQL Error: SQLCODE=-20521, SQLSTATE=428HV, SQLERRMC=_;7`
-  To fix it I delete leading underscore if `_id` -> `id`    
-  **Remove leading underscores from the alias of every searchable variable** like in 
    -  [JR57868: YOU CAN'T CREATE PIVOT TABLES WHEN THE SEARCHABLE VARIABLE ALIAS STARTS WITH AN UNDERSCORE](https://www.ibm.com/support/pages/apar/JR57868)
-  Sometimes hangs when `(*) Creating database testdb ... `
    -  Wait a little bit
    -  Sometimes it is helpful to `wsl --shutdown` and restart Docker Desktop on Windows    
    