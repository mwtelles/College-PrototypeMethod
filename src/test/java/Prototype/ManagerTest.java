package Prototype;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ManagerTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Manager manager = new Manager("Matheus", "Telles", new Role("Comercial", 3000));

        Manager managerClone = manager.clone();
        managerClone.setName("Marcos");
        managerClone.setLastName("Silva");
        managerClone.getRole().setFunction("Esportes");
        managerClone.getRole().setWorkload(1500);

        assertEquals("Manager{name='Matheus', lastName='Telles', role=Role{function='Comercial', workload=3000}}", manager.toString());
        assertEquals("Manager{name='Macos', lastName='Silva', role=Role{function='Esportes', workload=1500}}", managerClone.toString());
    }

}
