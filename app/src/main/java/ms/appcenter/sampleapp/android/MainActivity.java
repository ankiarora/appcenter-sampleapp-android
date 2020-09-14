package ms.appcenter.sampleapp.android;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        AppCenter.start(getApplication(), "df516f77-8b77-4d61-b02d-817001e88c0d", Analytics.class, Distribute.class, Crashes.class);
    }
}
