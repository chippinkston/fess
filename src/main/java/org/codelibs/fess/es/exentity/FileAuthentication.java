package org.codelibs.fess.es.exentity;

import org.codelibs.fess.es.bsentity.BsFileAuthentication;

/**
 * @author FreeGen
 */
public class FileAuthentication extends BsFileAuthentication {

    private static final long serialVersionUID = 1L;

    @Override
    public String getId() {
        return asDocMeta().id();
    }

    @Override
    public void setId(String id) {
        asDocMeta().id(id);
    }

    public Long getVersionNo() {
        return asDocMeta().version();
    }

    public void setVersionNo(Long version) {
        asDocMeta().version(version);
    }
}