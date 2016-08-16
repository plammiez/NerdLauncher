package ayp.aug.nerdlaucher;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NerdActivity extends SingleFragmentActivity {

    @Override
    protected Fragment onCreateFragment() {
        return NerdFragment.newInstance();
    }
}
