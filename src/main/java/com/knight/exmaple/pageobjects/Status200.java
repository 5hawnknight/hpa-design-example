package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.StatusCodesDashboardHandler;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public interface Status200 extends LoadablePageObject<Status200>
{
    StatusCodesDashboardHandler navigateToStatusCodesDashboard();

    String readStatusCodeText();
}
