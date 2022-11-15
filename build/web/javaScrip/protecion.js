/* 
 Created on : 03-nov-2022, 13:51:14
 Author     : rober
 */

<switch>
<route 
    path='/inicio.jsp' render={() =>{
          return user ? <Redirect to="/principal.jsp" /> : <inicio.jsp />
        }}
        >

</route>

<route exact path='/registro.jsp'>
    <inicio.jsp /> 
</route>
</switch>
