package org.labkey.test.pages.beataml;

import org.labkey.test.BaseWebDriverTest;
import org.labkey.test.Locator;
import org.labkey.test.WebTestHelper;
import org.labkey.test.components.ComponentElements;
import org.labkey.test.pages.LabKeyPage;

public class BeginPage extends LabKeyPage
{
    Elements _elements;

    public BeginPage(BaseWebDriverTest test)
    {
        super(test);
    }

    protected static String getController()
    {
        return "beataml";
    }

    protected static String getAction()
    {
        return "begin";
    }

    public static BeginPage beginAt(BaseWebDriverTest test, String containerPath)
    {
        test.beginAt(WebTestHelper.buildURL(getController(), containerPath, getAction()));
        return new BeginPage(test);
    }

    public Elements elements()
    {
        if (_elements == null)
            _elements = new Elements();
        return _elements;
    }

    private class Elements extends ComponentElements
    {
        private Elements()
        {
            super(_test.getDriver());
        }
    }
}
