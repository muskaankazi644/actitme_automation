package com.actitimeautomation;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Sanitygroup
{ @BeforeGroups(groups = {"regression", "sanity"})
    public void beforegroup()
    {   System.out.println("beforegroup");
    }


    @AfterGroups(groups = "sanity")
    public void aftergroup()
    {   System.out.println("aftergorup");
    }

    @Test(groups = {"regression"})
        public void regresiontest1 ()
        {   System.out.println("regressiontest1");
        }


    @Test(groups = {"sanity"})
        public void sanitytest2 ()
        {   System.out.println("sankitytest2");
        }


    @Test(groups = {"regression,sanity"})
        public void regressionsanitytest3 ()
        {   System.out.println("regressionsanitytest3");
        }
    }
