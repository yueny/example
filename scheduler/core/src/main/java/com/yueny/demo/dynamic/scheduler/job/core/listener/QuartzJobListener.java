package com.yueny.demo.dynamic.scheduler.job.core.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 * job监听器
 *
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2017年2月7日 下午1:04:06
 *
 */
public class QuartzJobListener implements JobListener {

	@Override
	public String getName() {
		return "quartzJobListener";
	}

	@Override
	public void jobExecutionVetoed(final JobExecutionContext context) {
		// .
	}

	@Override
	public void jobToBeExecuted(final JobExecutionContext context) {
		// .
	}

	@Override
	public void jobWasExecuted(final JobExecutionContext context, final JobExecutionException jobException) {
		System.out.println(context.getJobDetail().getKey() + ":C");
		// job.addJobData(JobDataKeyType.JOB_DATA_KEY, jobData);

		final String listenerxxx = (String) context.getMergedJobDataMap().get("listenerxxx");
		System.out.println(listenerxxx);

		// quartzJobsBiz.taskExpired(context.getJobDetail().getKey().getName());
	}

}
