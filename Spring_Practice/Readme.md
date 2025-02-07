Java Spring Framework

-- constructor injection

First create parameterized constructor

    public Alien(int codeLine,Laptop lap) {
        System.out.println("Parameterrized constructor is called");
        this.codeLine = codeLine;
        this.lap = lap;
    }

then in spring.xml file we can configure constructor injection

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="alien" class="org.example.Alien">
        <constructor-arg  ref="laptop" seconds"/>
        <constructor-arg  value="30 seconds"/>

    </bean>
    <bean id="laptop" class="org.example.Laptop">
        <property name="compileTime" value="30"/>
    </bean>

but here when we change the order how they know which value is need to particular variable

Solution -->
    
There are two possible solutions
    
    1.Mentioned the type 

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="alien" class="org.example.Alien">
        <constructor-arg type="org.example.Laptop" ref="laptop"/>
        <constructor-arg type="int" value="30 seconds"/>

    </bean>
    <bean id="laptop" class="org.example.Laptop">
        <property name="compileTime" value="30"/>
    </bean>

in here we have problem
    
   if we have all variables in type of " int "
   so it works when the different type of data
   

    2.specify the index number

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="alien" class="org.example.Alien">
        <constructor-arg index="0"  ref="laptop"/>
        <constructor-arg index="1"  value="30 seconds"/>

    </bean>
    <bean id="laptop" class="org.example.Laptop">
        <property name="compileTime" value="30"/>
    </bean>
    