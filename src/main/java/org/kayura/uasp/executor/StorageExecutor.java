/**
 * Copyright 2015-2015 the original author or authors.
 * HomePage: http://www.kayura.org
 */
package org.kayura.uasp.executor;

import org.kayura.type.GeneralResult;

/**
 * 用于执行文件存储的执行器.
 * 
 * @author liangxia@live.com
 */
public interface StorageExecutor {

	GeneralResult storage(String fileId, byte[] content);

}
