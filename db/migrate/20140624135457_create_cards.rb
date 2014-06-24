class CreateCards < ActiveRecord::Migration
  def change
    create_table :cards do |t|
      t.integer :board_id
      t.integer :column_id
      t.string :question
      t.integer :value
      t.timestamps
    end
  end
end
