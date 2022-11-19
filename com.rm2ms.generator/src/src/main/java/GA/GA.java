package src.main.java.GA;

import src.main.java.Evaluation.*;
import com.debacharya.nsgaii.Configuration;
import com.debacharya.nsgaii.NSGA2;
import com.debacharya.nsgaii.objectivefunction.AbstractObjectiveFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;
import com.rm2pt.req.generator.handlers.DetailWizardPage;
import com.rm2pt.req.generator.handlers.MyInfoWizard;
public class GA {
    static Integer iteration = 800;
    static Integer population = 300;

    public static void GArun() throws IOException {
    	iteration = Integer.parseInt(MyInfoWizard.iteration);
    	population = Integer.parseInt(MyInfoWizard.population);
        //创建配置类
    	List<AbstractObjectiveFunction> objectives = new ArrayList<>();
        //平均接口个数
        objectives.add(new Ob1());
        objectives.add(new Ob2());
        //方法内聚
        objectives.add(new Ob3());
        //稳定性
        objectives.add(new Ob4());
        //ob5导致微服务数量升高 1）减少包含单个用例的微服的权值 2）更改指标定义方式 3）
        objectives.add(new Ob5());
// creating your configuration with the new objectives
        Configuration configuration = new Configuration(objectives);

        remodelparse temp = new remodelparse();

        int len = remodelparse.numofEntity + remodelparse.numofUC;
        configuration.setChromosomeLength(len);
        configuration.setGenerations(iteration);
        configuration.setPopulationSize(population);
        MyParticipantCreator creator= new MyParticipantCreator();
        Mycross mycross = new Mycross(creator);
        configuration.setMutation(new Mymutation());
        configuration.setCrossover(mycross);
        configuration.setChildPopulationProducer(new Childpop());
        configuration.setPopulationProducer(new Initpop());
        configuration.setGeneticCodeProducer(new GeneticCode());
//run() returns the final child population or the pareto front
        //Population paretoFront = nsga2.run();

        //创建NSGA2类
//		Composite composite_global = new Composite(null, SWT.NONE);
//		composite_global.setLayout(new GridLayout(1, false));
//		  
//		Composite composite_top = new Composite(composite_global, SWT.NONE);
//		GridData gd_composite_top = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
//		gd_composite_top.heightHint = 41;
//		gd_composite_top.widthHint = 780;
//		composite_top.setLayoutData(gd_composite_top);
//		composite_top.setLayout(new GridLayout(3, false));
//
//		ProgressBar progressBar = new ProgressBar(composite_top, SWT.NONE);
//		GridData gd_progressBar = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
//		gd_progressBar.widthHint = 630;
//		progressBar.setLayoutData(gd_progressBar);
//		progressBar.setMinimum(0);
//		progressBar.setMaximum(100);
//		globalProgressBar = progressBar;
//		globalProgressBar.setSelection(50);
        NSGA2 nsga2 = new NSGA2(configuration);
        nsga2.run();
    }

}
