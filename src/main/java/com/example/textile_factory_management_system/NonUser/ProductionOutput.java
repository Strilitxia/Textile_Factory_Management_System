package com.example.textile_factory_management_system.NonUser;

public class ProductionOutput {
    private int outputId, batchId, totalProduced, defectCount, usableCount;

    public ProductionOutput(int outputId, int batchId, int totalProduced, int defectCount, int usableCount) {
        this.outputId = outputId;
        this.batchId = batchId;
        this.totalProduced = 0;
        this.defectCount = 0;
        this.usableCount = 0;
    }

    public int getOutputId() {
        return outputId;
    }

    public int getBatchId() {
        return batchId;
    }

    public int getTotalProduced() {
        return totalProduced;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public int getUsableCount() {
        return usableCount;
    }
}
