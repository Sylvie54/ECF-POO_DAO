/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.TestCase.assertEquals;
import metier.classes.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import metier.exceptions.MetiersException;
import static org.junit.Assert.*;

/**
 *
 * @author Sylvie
 */
public class TestClient  {
    
    public TestClient() {
    }
    
    

    @Test
    public final void testInstanciation() throws Exception{
        Client client = new Client(3,"Peugeot","null part", 3000000,30);    
        assertTrue(true) ;  
    }
    @Test(expected=MetiersException.class)
    public final void testInstanciationFail() throws MetiersException {
            Client client = new Client(3,"","null part", 3000000,30); 
            assertTrue(false) ;  
    }
}
