package com.example.textile_factory_management_system.asif.ProductionManager.Model;
import com.example.textile_factory_management_system.NonUser.MaterialRequisition;
import com.example.textile_factory_management_system.NonUser.ProductionBatch;
import com.example.textile_factory_management_system.NonUser.ProductionOutput;
import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.time.LocalDate;


public class ProductionManager extends User {

    private static final String PRODUCTIONBATCH_FILE = "ProductionBatches.bin";
    private static  final String PRODUCTIONOUTPUT_FILE = "ProductionOutputs.bin";
    private static final String WORKERS_FILE = "Workers.bin";
    private static final String MATERIAL_REQUISITIONS_FILE = "MaterialRequisitions.bin";

    public ProductionManager(int userId, String username, String password, String email, String role) {
        super(userId, username, password, email, role);
    }

    public static int generateBatchId(){
        ObservableList<ProductionBatch> batches = FileReadWrite.loadData(ProductionBatch.class,"ProductionBatches.bin");
        return batches.size() + 1;
    }

    public static boolean createNewProductionBatch(int batchId, int quantity, int orderId, int targetId, String productType, String completeStatus, LocalDate createdOn){
        try {
            ProductionBatch pdb = new ProductionBatch(batchId, quantity, orderId, targetId, productType, completeStatus, LocalDate.now());
            FileReadWrite.append(pdb, PRODUCTIONBATCH_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ObservableList<ProductionTarget> viewAssignedProductionTarget(){
        return FileReadWrite.loadData(ProductionTarget.class,"ProductionTargets.bin");
    }

    public static ProductionOutput viewProductionOutput(int batchId){
        ObservableList<ProductionOutput> pdo = FileReadWrite.loadData(ProductionOutput.class,PRODUCTIONOUTPUT_FILE);
        for (ProductionOutput p : pdo){
            if(p.getBatchId() == batchId){
                return p;
            }
        }
        return null;
    }
    public static int generateProductionOutputID(){
        ObservableList<ProductionOutput> outputs = FileReadWrite.loadData(ProductionOutput.class,"ProductionBatches.bin");
        return outputs.size() + 1;
    }

    public static ObservableList<ProductionBatch> viewAllProductionBatches(){
        return FileReadWrite.loadData(ProductionBatch.class, PRODUCTIONBATCH_FILE);
    }

    public static boolean recordProductionOutput(int batchId, int totalProduced, int defectCount, int usableCount){
        try {
            ObservableList<ProductionOutput> allOutputs = FileReadWrite.loadData(ProductionOutput.class, PRODUCTIONOUTPUT_FILE);
            boolean found = false;
            for (int i = 0; i < allOutputs.size(); i++) {
                if (allOutputs.get(i).getBatchId() == batchId) {
                    ProductionOutput existing = allOutputs.get(i);
                    existing.setTotalProduced(totalProduced);
                    existing.setDefectCount(defectCount);
                    existing.setUsableCount(usableCount);
                    allOutputs.set(i, existing);
                    found = true;
                    break;
                }
            }
            if (!found) {
                int newOutputId = generateProductionOutputID();
                ProductionOutput newOutput = new ProductionOutput(newOutputId, batchId, totalProduced, defectCount, usableCount);
                allOutputs.add(newOutput);
            }
            FileReadWrite.saveData(allOutputs, PRODUCTIONOUTPUT_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ObservableList<Worker> loadAllWorkers(){
        return FileReadWrite.loadData(Worker.class, WORKERS_FILE);
    }

    public static boolean submitMaterialRequisition(String materialType, float amount){
        try {
            MaterialRequisition requisition = new MaterialRequisition(materialType, amount);
            FileReadWrite.append(requisition, MATERIAL_REQUISITIONS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
