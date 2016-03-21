package com.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * <h3>EnvironmentUtil</h3>
 * <h4>�����ļ��Ļ�������</h4>
 * <h4>Special Notes</h4>
 * 
 * @ver 0.1
 * @author jing.chen 2009-7-7
 */
public class EnvironmentUtil
{

	private Properties propertie;

	private InputStream inputFile;

	private FileOutputStream outputFile;

	private static Map<String,EnvironmentUtil> ecMap = new HashMap<String,EnvironmentUtil>();
    
	public static String ENVIRONMENT_PROPERTIES_PATH = "config.properties";
	
	private EnvironmentUtil()
	{
		this(ENVIRONMENT_PROPERTIES_PATH );
	}

	/**
	 * 
	 * @param filePath
	 */
	private EnvironmentUtil(String filePath)
	{
		loaderProperties( filePath );
	}

	private synchronized void loaderProperties(String filePath)
	{
		propertie = new Properties();
		setProperties( filePath );
	}


	/**
	 * ���Ψһ��EnvironmentUtilʵ��
	 * @param filePath
	 * @return
	 */
	public static EnvironmentUtil getInstance(String filePath)
	{
		EnvironmentUtil ec;
		if(ecMap.get(filePath) == null){
			ec = new EnvironmentUtil(filePath);
			ecMap.put(filePath, ec);
		}else{
			ec = ecMap.get(filePath);
		}
		return ec;
	}
	
	
	/**
	 * ���Ψһ��EnvironmentUtilʵ��
	 * 
	 * @return
	 */
	public  static EnvironmentUtil getInstance()
	{
		EnvironmentUtil ec;
		if(ecMap.get(ENVIRONMENT_PROPERTIES_PATH) == null){
			ec = new EnvironmentUtil(ENVIRONMENT_PROPERTIES_PATH);
			ecMap.put(ENVIRONMENT_PROPERTIES_PATH, ec);
		}else{
			ec = ecMap.get(ENVIRONMENT_PROPERTIES_PATH);
		}
		return ec;
	}

	public synchronized void refresh(String filePath)
	{
		if ( filePath == null || "".equals( filePath ) )
			loaderProperties(ENVIRONMENT_PROPERTIES_PATH );
		else
			loaderProperties( filePath );
	}

	public synchronized void refresh()
	{
		refresh("");
	}

	public Properties getProperties()
	{
		if ( propertie == null ){
			propertie = new Properties();
		}
		return propertie;
	}

	/**
	 * װ�������ļ�
	 * 
	 * @param filePath
	 * Ҫ��ȡ�������ļ���·��+����
	 */
	private void setProperties(String filePath)
	{
		try
		{
			try
			{
				inputFile = new FileInputStream( filePath );
			} catch ( Exception e )
			{
				// getResourceAsStream()������ȡ���·��
				if ( filePath.startsWith( "/" ) )
					inputFile = EnvironmentUtil.class.getResourceAsStream( filePath );
				else
					inputFile = EnvironmentUtil.class.getResourceAsStream( "/" + filePath );
			}
			propertie.load( inputFile );
			inputFile.close();
		} catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	/** */
	/**
	 * ��ü�ֵ
	 * 
	 * @param key
	 * ȡ����ֵ�ļ�
	 * @return key��ֵ
	 */
	public String getPropertyValue(String key)
	{
		if ( propertie.containsKey( key ) )
		{
			// �õ�ĳһ���Ե�ֵ
			String value = propertie.getProperty( key );
			return value;
		} else
			return "";
	}

	/**
	 * ֱ��ͨ��ָ���ļ������Ӧ�ļ�ֵ
	 * 
	 * @param fileName
	 * @param key
	 * @return
	 */
	public String getPropertyValue(String fileName, String key)
	{
		setProperties( fileName );
		String value = "";

		if ( propertie.containsKey( key ) )
			value = propertie.getProperty( key );

		return value;
	}

	/**
	 * ���properties�ļ������е�key����ֵ
	 */
	public void clear()
	{
		if ( propertie != null )
			propertie.clear();
	}

//	/**
//	 * �ı�����һ��key��ֵ����key������properties�ļ���ʱ��key��ֵ��value�����棬 ��key������ʱ����key��ֵ��value
//	 * 
//	 * @param key
//	 * Ҫ����ļ�
//	 * @param value
//	 * Ҫ�����ֵ
//	 */
//	private void setValue(String key, String value)
//	{
//		propertie.setProperty( key, value );
//	}

	/**
	 * �����ĺ���ļ����ݴ���ָ�����ļ��У����ļ��������Ȳ����ڡ�
	 * 
	 * @param fileName
	 * �ļ�·��+�ļ�����
	 * @param description
	 * �Ը��ļ�������
	 */
	public void saveFile(String fileName, String description)
	{
		try
		{
			outputFile = new FileOutputStream( fileName );
			propertie.store( outputFile, description );
			outputFile.close();
		} catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		} catch ( IOException ioe )
		{
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		// System.out.println(n(n(n(EnvironmentUtil.getInstance().getPropertyValue("aaaaa"));
	}
}
