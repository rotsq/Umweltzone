/*
 *  Copyright (C) 2013  Tobias Preuss, Peter Vasil
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.avpptr.umweltzone.about;

import android.os.Bundle;
import android.view.Menu;

import de.avpptr.umweltzone.BuildConfig;
import de.avpptr.umweltzone.R;
import de.avpptr.umweltzone.analytics.TrackingPoint;
import de.avpptr.umweltzone.base.BaseActivity;
import de.avpptr.umweltzone.utils.ViewHelper;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ViewHelper.setupTextViewSimple(this,
                R.id.buildVersion, "v." + getBuildVersionName());
        ViewHelper.setupTextViewSimple(this,
                R.id.buildTime, BuildConfig.BUILD_TIME);
        ViewHelper.setupTextViewSimple(this,
                R.id.buildVersionCode, "" + BuildConfig.BUILD_VERSION_CODE);
        ViewHelper.setupTextViewSimple(this,
                R.id.buildHash, BuildConfig.GIT_SHA);

        ViewHelper.setupTextViewExtended(this, R.id.app_info_environment_agency,
                R.string.appinfo_references_name_umweltbundesamt,
                R.string.appinfo_references_url_umweltbundesamt, TrackingPoint.AboutItemClick,
                "environment_agency");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_wikimedia_commons,
                R.string.appinfo_references_name_wikimedia_commons,
                R.string.appinfo_references_url_wikimedia_commons, TrackingPoint.AboutItemClick,
                "wikimedia_commons");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_google_play_services,
                R.string.appinfo_references_name_googleplayservices,
                R.string.appinfo_references_url_googleplayservices, TrackingPoint.AboutItemClick,
                "google_play_services_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_google_support_library,
                R.string.appinfo_references_name_googlesupportlibrary,
                R.string.appinfo_references_url_googlesupportlibrary, TrackingPoint.AboutItemClick,
                "google_support_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_actionbarcompat,
                R.string.appinfo_references_name_actionbarcompat,
                R.string.appinfo_references_url_actionbarcompat, TrackingPoint.AboutItemClick,
                "action_bar_compat_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_jackson,
                R.string.appinfo_references_name_jackson,
                R.string.appinfo_references_url_jackson, TrackingPoint.AboutItemClick,
                "jackson_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_google_analytics,
                R.string.appinfo_references_name_ga,
                R.string.appinfo_references_url_ga, TrackingPoint.AboutItemClick,
                "google_analytics");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_trace_droid,
                R.string.appinfo_references_name_tracdroid,
                R.string.appinfo_references_url_tracedroid, TrackingPoint.AboutItemClick,
                "trace_droid_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_ckchangelog,
                R.string.appinfo_references_name_ckchangelog,
                R.string.appinfo_references_url_ckchangelog, TrackingPoint.AboutItemClick,
                "ck_changelog_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_typed_preferences,
                R.string.appinfo_references_name_typedpreferences,
                R.string.appinfo_references_url_typedpreferences, TrackingPoint.AboutItemClick,
                "typed_preferences_library");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_gpl,
                R.string.appinfo_license_url_title_gpl,
                R.string.appinfo_license_url_gpl, TrackingPoint.AboutItemClick,
                "gpl_url");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_odbl,
                R.string.appinfo_license_url_title_odbl,
                R.string.appinfo_license_url_odbl, TrackingPoint.AboutItemClick,
                "odbl_url");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_creative_commons,
                R.string.appinfo_license_url_title_cc,
                R.string.appinfo_license_url_cc, TrackingPoint.AboutItemClick,
                "cc_url");
        ViewHelper.setupTextViewExtended(this, R.id.app_info_source_code,
                R.string.appinfo_sourcecode_url_title,
                R.string.appinfo_sourcecode_url, TrackingPoint.AboutItemClick,
                "source_code_url");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
