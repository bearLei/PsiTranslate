package com.example.administrator.psitranslate.glossary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.administrator.psitranslate.R;
import com.example.administrator.psitranslate.glossary.holder.AccessoriesHolder;
import com.example.administrator.psitranslate.glossary.holder.CommonDeviceTermsContanerHolder;
import com.example.administrator.psitranslate.glossary.holder.DevolpeHolder;
import com.example.administrator.psitranslate.glossary.holder.EcoSystemHolder;
import com.example.administrator.psitranslate.glossary.holder.HardwareAndsoftwareContainerHolder;
import com.example.administrator.psitranslate.glossary.holder.PackingHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GlossaryActivity extends AppCompatActivity {

    @BindView(R.id.Common_device_terms_contaner)
    LinearLayout CommonDeviceTermsContaner;
    @BindView(R.id.Hardware_software_contaner)
    LinearLayout HardwareSoftwareContaner;
    @BindView(R.id.package_contaner)
    LinearLayout packageContaner;
    @BindView(R.id.accessories_contaner)
    LinearLayout accessoriesContaner;
    @BindView(R.id.ecosystem_contaner)
    LinearLayout ecosystemContaner;
    @BindView(R.id.psi_develop_contaner)
    LinearLayout psiDevelopContaner;


//    private CommonDeviceTermsContanerHolder commonDeviceTermsContanerHolder;
    private HardwareAndsoftwareContainerHolder hardwareAndsoftwareContainerHolder;
    private PackingHolder packingHolder;
    private AccessoriesHolder accessoriesHolder;
    private EcoSystemHolder ecoSystemHolder;
    private DevolpeHolder devolpeHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary);
        ButterKnife.bind(this);
//        initCommonDeviceTermsContanerHolder();
        initHardwareAndsoftwareContainerHolder();
        initPackageHolder();
        initAccessoriesHolder();
        initEcoSystemHolder();
        initDevelopHolder();
    }

    //hardwareAndsoftwareContainerHolder
    private void initHardwareAndsoftwareContainerHolder() {
        if (hardwareAndsoftwareContainerHolder == null) {
            hardwareAndsoftwareContainerHolder = new HardwareAndsoftwareContainerHolder(this);
        }
        HardwareSoftwareContaner.removeAllViews();
        HardwareSoftwareContaner.addView(hardwareAndsoftwareContainerHolder.getRootView());
    }

    //CommonDeviceTermsContanerHolder
//    private void initCommonDeviceTermsContanerHolder() {
//        if (commonDeviceTermsContanerHolder == null) {
//            commonDeviceTermsContanerHolder = new CommonDeviceTermsContanerHolder(this);
//        }
//        CommonDeviceTermsContaner.removeAllViews();
//        CommonDeviceTermsContaner.addView(commonDeviceTermsContanerHolder.getRootView());
//    }

    //PackageHolder
    private void initPackageHolder() {
        if (packingHolder == null) {
            packingHolder = new PackingHolder(this);
        }
        packageContaner.removeAllViews();
        packageContaner.addView(packingHolder.getRootView());
    }

    //附件容器
    private void initAccessoriesHolder() {
        if (accessoriesHolder == null) {
            accessoriesHolder = new AccessoriesHolder(this);
        }
        accessoriesContaner.removeAllViews();
        accessoriesContaner.addView(accessoriesHolder.getRootView());
    }

    //生态
    private void initEcoSystemHolder() {
        if (ecoSystemHolder == null) {
            ecoSystemHolder = new EcoSystemHolder(this);
        }
        ecosystemContaner.removeAllViews();
        ecosystemContaner.addView(ecoSystemHolder.getRootView());
    }

    //发展
    private void initDevelopHolder(){
        if (devolpeHolder == null){
            devolpeHolder = new DevolpeHolder(this);
        }
        psiDevelopContaner.removeAllViews();
        psiDevelopContaner.addView(devolpeHolder.getRootView());
    }
}
