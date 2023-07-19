import pandas as pd




df = pd.read_csv("grades.csv",header = None, index_col=False)

# number_rows = df.shape[0]
# print(number_rows)

# Find rows with null values
null_rows = df[df.isnull().any(axis=1)]
# print(null_rows)

# for df.isnull().any():
    # print("h")

null_rows.to_csv("xyz.csv",header = None, index=False)
# # print(null_rows)
# for index,row in df.iterrows():
#     if row.isnull().any():
#         found_croupt_index = index
        
        
#         # print("h")
# loc_row = df.loc[found_croupt_index]      
# print(loc_row)

# # null_rows.to_csv("xyz.csv",index=False)
# loc_row.to_csv("errors.csv",index=False,header = None)

# data_list.append(null_rows)





# Print the null rows
# print(data_list)

# while count < number_rows:
        # data_list =[]
        # print(count)
        

            # for entry in row:
                # print(entry)
                

            
            # loc_row = df.loc[count]
            # data_list.append(loc_row)
            
            # print(data_list)    

        # break
# print(data_list)
# data_list = []

            # df.loc[index].to_csv("errordata.csv")

# for row in null_rows:
#     print(row)

#     empty_rows = row
#     data_list.append(empty_rows)
#     print(data_list)

    # row.to_csv("errordata.csv",index = False)
            
            

    
# print(empty_rows)
            
            
        

        
    
        


        





        
        