autowire can be used to 

   1.if you do not specify the property
      then you can go with autowire 
   
In here when you mentioned 
   
      autowire="byType"
      
      then it must need primary bean for that.

      <bean id="alien" class="org.example.Alien" autowire="byType">
      <!--        <property name="com" ref="com" />-->
    </bean>

    <bean id="com2" class="org.example.Laptop">
      //we can simply say this is primary 
    </bean>

    <bean id="com1" class="org.example.Desktop">

    </bean>

for that we can use primary field is true

      <bean id="alien" class="org.example.Alien" autowire="byType">

    </bean>

    <bean id="com2" class="org.example.Laptop" primary="true">
      //we can simply say this is primary 
    </bean>

    <bean id="com1" class="org.example.Desktop">

    </bean>

primary work when spring has confusion which bean to use


when you use
   
      lazy-init="true"

      for bean it create object when the bean is used by first time 