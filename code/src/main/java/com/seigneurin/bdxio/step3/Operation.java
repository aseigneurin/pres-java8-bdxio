package com.seigneurin.bdxio.step3;

public interface Operation<T> {
    T function();

    void onSuccess(T res);

    void onError(Exception ex);
}