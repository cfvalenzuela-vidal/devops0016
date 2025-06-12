package com.equipo.taskmaster;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.ArrayList;

public class AppTest {

    public static void main(String[] args) {
        System.out.println("Ambiente: " + System.getProperty("env.name"));
    }

    @Test
    public void testApp() {
        System.out.println("Ambiente: " + System.getProperty("env.name"));
        assertTrue(true);  // Verifica que true es true (prueba básica)
    }

    @Test
    public void testAddTask() {
        App.tasks = new ArrayList<>();  // Limpia la lista antes de probar
        App.addTask("Terminar ejercicio Maven");
        assertEquals(1, App.tasks.size());  // Verifica que se añadió una tarea
    }
}
