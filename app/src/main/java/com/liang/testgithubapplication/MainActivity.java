package com.liang.testgithubapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 第一步：检查、安装git；注册GitHub
 * 第二步：创建项目并使用git初始化，VCS->Enable Version Control Integration...；(可编辑.gitignore文件)
 * 第三步：与GitHub建立远程连接，VCS->Share Project on Github
 */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
